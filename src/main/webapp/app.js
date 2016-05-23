angular.module('sistema', ['app.home', 'app.caixa', 'ui.router'])
        .config(function ($stateProvider, $urlRouterProvider){
            
            $urlRouterProvider.otherwise('home');
            var urlCaixa = location.origin + '/financeiro/api/caixa';
            var urlCategoria = location.origin + '/financeiro/api/categoria';
            
            $stateProvider  
                .state('home', {
                    url: '/home',
                    templateUrl: 'paginas/home/home.html',
                    controller: 'HomeController'    
                })
                .state('caixa', {
                    url: '/caixa',
                    templateUrl: 'paginas/caixa/caixa.html',
                    controller: 'CaixaController'    
                })
                .state('caixalistagem', {
                    url: '/caixalistagem',
                    templateUrl: 'paginas/caixa/listar.html',
                    controller: 'CaixaListarController'    
                })
                .state('caixaeditar', {
                    url: '/caixaeditar/:id',
                    templateUrl: 'paginas/caixa/caixa.html',
                    controller: 'CaixaController'   ,
                    resolve: {
                        entidade: function ($http, $stateParams){
                            return $http.get(urlCaixa.concat('/'+$stateParams.id))
                        }
                    }
                })
                .state('categoria', {
                    url: '/categoria',
                    templateUrl: 'paginas/categoria/categoria.html'
//                    controller: 'CategoriaController'    
                })
                .state('categorialistagem', {
                    url: '/categorialistagem',
                    templateUrl: 'paginas/categoria/listar.html',
                    controller: 'CategoriaListarController'    
                })
                .state('categoriaeditar', {
                    url: '/categoriaeditar/:id',
                    templateUrl: 'paginas/categoria/categoria.html',
                    controller: 'CategoriaController'   ,
                    resolve: {
                        entidade: function ($http, $stateParams){
                            return $http.get(urlCategoria.concat('/'+$stateParams.id))
                        }
                    }
                })
        })
