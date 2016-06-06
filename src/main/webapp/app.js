angular.module('sistema', ['app.home', 'app.caixa', 'app.categoria', 'app.fisica', 'ui.router'])
        .config(function ($stateProvider, $urlRouterProvider) {

            $urlRouterProvider.otherwise('home');
            var urlCaixa = location.origin + '/financeiro/api/caixa';
            var urlCategoria = location.origin + '/financeiro/api/categoria';
            var urlFisica = location.origin + '/financeiro/api/fisica';
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
                                return $http.get(urlCaixa.concat('/' + $stateParams.id))
                            }
                        }
                    })


                    //Categoria
                    .state('categoria', {
                        url: '/categoria',
                        templateUrl: 'paginas/categoria/categoria.html',
                        controller: 'CategoriaController',
                        resolve: {
                            entidade: function () {
                                return {}
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
                                return $http.get(urlCategoria.concat('/' + $stateParams.id))
                            }
                        }
                    })
                    //Fisica
                    .state('fisica', {
                        url: '/fisica',
                        templateUrl: 'paginas/fisica/fisica.html',
                        controller: 'FisicaController',
                        resolve: {
                            entidade: function () {
                                return {}
                            }
                        }
                    })
                    .state('fisicalistagem', {
                        url: '/fisicalistagem',
                        templateUrl: 'paginas/fisica/listar.html',
                        controller: 'FisicaListarController'
                    })
                    .state('fisicaeditar', {
                        url: '/fisicaeditar/:id',
                        templateUrl: 'paginas/fisica/fisica.html',
                        controller: 'FisicaController',
                        resolve: {
                            entidade: function ($http, $stateParams) {
                                return $http.get(urlFisica.concat('/' + $stateParams.id))
                            }
                        }
                    })
        })
