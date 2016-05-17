angular.module('sistema', ['app.home', 'app.caixa', 'ui.router'])
        .config(function ($stateProvider, $urlRouterProvider){
            
            $urlRouterProvider.otherwise('home');
            var url = location.origin + '/financeiro/api/caixa';
            
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
                            return $http.get(url.concat('/'+$stateParams.id))
                        }
                    }
                })
        })
