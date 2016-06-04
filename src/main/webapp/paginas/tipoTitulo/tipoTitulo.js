angular.module('app.tipoTitulo', [])
        .controller('TipoTituloController', function ($scope, TipoTituloService, $state, entidade) {
            $scope.entidade = entidade.data || {};

            $scope.salvar = function (entidade) {
                TipoTituloService.salvar(entidade)
                        .then(function (resposta) {
                            if (resposta.status == 200) {
                                $state.go('tipoTitulolistagem')
                            }
                        })
            }

        })
        .controller('TipoTituloListarController', function ($scope, TipoTituloService) {

            $scope.remover = function (id) {
                TipoTituloService.remover(id)
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
                TipoTituloService.buscar()
                        .then(function (resposta) {
                            $scope.dados = resposta.data;
                        })
            }

            $scope.listar();

        })
        .service('TipoTituloService', function ($http) {
            var url = location.origin + '/financeiro/api/tipoTitulo'

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