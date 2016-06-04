angular.module('app.pessoa', [])
        .controller('PessoaController', function ($scope, PessoaService, $state, entidade) {
            $scope.entidade = entidade.data || {};

            $scope.salvar = function (entidade) {
                PessoaService.salvar(entidade)
                        .then(function (resposta) {
                            if (resposta.status == 200) {
                                $state.go('pessoalistagem')
                            }
                        })
            }

        })
        .controller('PessoaListarController', function ($scope, PessoaService) {

            $scope.remover = function (id) {
                PessoaService.remover(id)
                        .then(function (resposta) {
                            console.log(resposta)
                            if (resposta.status == 200) {
                                $scope.listar();
                            } else {
                                alert('Erro ao excluir');
                            }
                        })
            }

            $scope.listar = function () {
                PessoaService.buscar()
                        .then(function (resposta) {
                            $scope.dados = resposta.data;
                        })
            }

            $scope.listar();

        })
        .service('PessoaService', function ($http) {
            var url = location.origin + '/financeiro/api/pessoa'

            this.salvar = function (entidade) {
                if (entidade.codigo) {
                    return $http.put(url.concat('/' + entidade.codigo), entidade);
                } else {
                    return $http.post(url, entidade);
                }
            }

            this.buscar = function () {
                return $http.get(url);
            }

            this.remover = function (id) {
                return $http.delete(url.concat('/' + id));
            }

        })