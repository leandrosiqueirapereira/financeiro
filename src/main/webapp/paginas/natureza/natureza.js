angular.module('app.natureza', [])
        .controller('NaturezaController', function ($scope, NaturezaService, $state, entidade) {
            $scope.entidade = entidade.data || {};

            $scope.salvar = function (entidade) {
                NaturezaService.salvar(entidade)
                        .then(function (resposta) {
                            if (resposta.status == 200) {
                                $state.go('naturezalistagem')
                            }
                        })
            }

        })
        .controller('NaturezaListarController', function ($scope, NaturezaService) {

            $scope.remover = function (id) {
                NaturezaService.remover(id)
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
                NaturezaService.buscar()
                        .then(function (resposta) {
                            $scope.dados = resposta.data;
                        })
            }

            $scope.listar();

        })
        .service('NaturezaService', function ($http) {
            var url = location.origin + '/financeiro/api/natureza'

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