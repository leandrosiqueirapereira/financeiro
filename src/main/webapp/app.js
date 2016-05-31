angular.module('sistema', ['app.home', 'app.caixa', 'app.categoria', 'ui.router'])
        .config(function ($stateProvider, $urlRouterProvider) {

            $urlRouterProvider.otherwise('home');
            var url = location.origin + '/financeiro/api/caixa';
            var url2 = location.origin + '/financeiro/api/categoria';
            var url3 = location.origin + '/financeiro/api/movimentocaixa';

            $stateProvider
                    .state('home', {
                        url: '/home',
                        templateUrl: 'paginas/home/home.html',
                        controller: 'HomeController'
                    })
                    .state('caixa', {
                        url: '/caixa',
                        templateUrl: 'paginas/caixa/caixa.html',
                        controller: 'CaixaController',
                        resolve: {
                            entidade: function () {
                                return {};
                            }
                        }
                    })
                    .state('caixalistagem', {
                        url: '/caixalistagem',
                        templateUrl: 'paginas/caixa/listar.html',
                        controller: 'CaixaListarController'
                    })
                    .state('caixaeditar', {
                        url: '/caixaeditar/:id',
                        templateUrl: 'paginas/caixa/caixa.html',
                        controller: 'CaixaController',
                        resolve: {
                            entidade: function ($http, $stateParams) {
                                return $http.get(url.concat('/' + $stateParams.id))
                            }
                        }
                    })


//                Categoria

                    .state('categoria', {
                        url: '/categoria',
                        templateUrl: 'paginas/categoria/categoria.html',
                        controller: 'CategoriaController',
                        resolve: {
                            entidade: function () {
                                return {};
                            }
                        }
                    })
                    .state('categorialistagem', {
                        url: '/categorialistagem',
                        templateUrl: 'paginas/categoria/listar.html',
                        controller: 'CategoriaListarController'
                    })
                    .state('categoriaeditar', {
                        url: '/categoriaeditar/:id',
                        templateUrl: 'paginas/categoria/categoria.html',
                        controller: 'CategoriaController',
                        resolve: {
                            entidade: function ($http, $stateParams) {
                                return $http.get(url2.concat('/' + $stateParams.id))
                            }
                        }
                    })


//
////                MOVIMENTO CAIXA
//
//
//                    .state('movimentocaixa', {
//                        url: '/movimentocaixa',
//                        templateUrl: 'paginas/movimentocaixa/movimentocaixa.html',
//                        controller: 'MovimentoCaixaController',
//                        resolve: {
//                            entidade: function () {
//                                return {};
//                            }
//                        }
//                    })
//                    .state('movimentocaixalistagem', {
//                        url: '/movimentocaixalistagem',
//                        templateUrl: 'paginas/movimentocaixa/listar.html',
//                        controller: 'MovimentoCaixaListarController'
//                    })
//                    .state('movimentocaixaeditar', {
//                        url: '/movimentocaixaeditar/:id',
//                        templateUrl: 'paginas/movimentocaixa/movimentocaixa.html',
//                        controller: 'MovimentoCaixaController',
//                        resolve: {
//                            entidade: function ($http, $stateParams) {
//                                return $http.get(url3.concat('/' + $stateParams.id))
//                            }
//                        }
//                    })
//

        })
