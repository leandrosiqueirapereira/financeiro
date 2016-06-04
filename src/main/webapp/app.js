angular.module('sistema', ['app.home','app.caixa','app.categoria','app.fisica','app.formaPagamento','app.juridica','app.movimentoCaixa',
               'app.natureza','app.pagamento','app.pessoa','app.saldo','app.tipoTitulo','app.titulo','ui.router'])
        .config(function ($stateProvider, $urlRouterProvider) {

            $urlRouterProvider.otherwise('home');
            var url = location.origin + '/financeiro/api/caixa';
            var url1 = location.origin + '/financeiro/api/categoria';
            var url2 = location.origin + '/financeiro/api/fisica';
            var url4 = location.origin + '/financeiro/api/formapagamento';
            var url5 = location.origin + '/financeiro/api/juridica';
            var url6 = location.origin + '/financeiro/api/movimentocaixa';
            var url7 = location.origin + '/financeiro/api/natureza';
            var url8 = location.origin + '/financeiro/api/pagamento';
            var url9 = location.origin + '/financeiro/api/pessoa';
            var url10 = location.origin + '/financeiro/api/saldo';
            var url11 = location.origin + '/financeiro/api/tipotitulo';
            var url12 = location.origin + '/financeiro/api/titulo';

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


                    ////                MOVIMENTO CAIXA


                    .state('movimentoCaixa', {
                        url: '/movimentoCaixa',
                        templateUrl: 'paginas/movimentoCaixa/movimentoCaixa.html',
                        controller: 'MovimentoCaixaController',
                        resolve: {
                            entidade: function () {
                                return {};
                            }
                        }
                    })
                    .state('movimentoCaixalistagem', {
                        url: '/movimentoCaixalistagem',
                        templateUrl: 'paginas/movimentoCaixa/listar.html',
                        controller: 'MovimentoCaixaListarController'
                    })
                    .state('movimentoCaixaeditar', {
                        url: '/movimentoCaixaeditar/:id',
                        templateUrl: 'paginas/movimentoCaixa/movimentoCaixa.html',
                        controller: 'MovimentoCaixaController',
                        resolve: {
                            entidade: function ($http, $stateParams) {
                                return $http.get(url.concat('/' + $stateParams.id))
                            }
                        }
                    })

// Fisica

                    .state('fisica', {
                        url: '/fisica',
                        templateUrl: 'paginas/fisica/fisica.html',
                        controller: 'FisicaController',
                        resolve: {
                            entidade: function () {
                                return {};
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
                                return $http.get(url.concat('/' + $stateParams.id))
                            }
                        }
                    })
                    
                                        ////                Forma Pagamento


                    .state('formaPagamento', {
                        url: '/formaPagamento',
                        templateUrl: 'paginas/formaPagamento/formaPagamento.html',
                        controller: 'FormaPagamentoController',
                        resolve: {
                            entidade: function () {
                                return {};
                            }
                        }
                    })
                    .state('formaPagamentolistagem', {
                        url: '/formaPagamentolistagem',
                        templateUrl: 'paginas/formaPagamento/listar.html',
                        controller: 'FormaPagamentoListarController'
                    })
                    .state('formaPagamentoeditar', {
                        url: '/formaPagamentoeditar/:id',
                        templateUrl: 'paginas/formaPagamento/formaPagamento.html',
                        controller: 'FormaPagamentoController',
                        resolve: {
                            entidade: function ($http, $stateParams) {
                                return $http.get(url.concat('/' + $stateParams.id))
                            }
                        }
                    })
                    
                    
                    //                Juridica

                    .state('juridica', {
                        url: '/juridica',
                        templateUrl: 'paginas/juridica/juridica.html',
                        controller: 'JuridicaController',
                        resolve: {
                            entidade: function () {
                                return {};
                            }
                        }
                    })
                    .state('juridicalistagem', {
                        url: '/juridicalistagem',
                        templateUrl: 'paginas/juridica/listar.html',
                        controller: 'JuridicaListarController'
                    })
                    .state('juridicaeditar', {
                        url: '/juridicaeditar/:id',
                        templateUrl: 'paginas/juridica/juridica.html',
                        controller: 'JuridicaController',
                        resolve: {
                            entidade: function ($http, $stateParams) {
                                return $http.get(url2.concat('/' + $stateParams.id))
                            }
                        }
                    })
                    
                                        //                Natureza

                    .state('natureza', {
                        url: '/natureza',
                        templateUrl: 'paginas/natureza/natureza.html',
                        controller: 'NaturezaController',
                        resolve: {
                            entidade: function () {
                                return {};
                            }
                        }
                    })
                    .state('naturezalistagem', {
                        url: '/naturezalistagem',
                        templateUrl: 'paginas/natureza/listar.html',
                        controller: 'NaturezaListarController'
                    })
                    .state('naturezaeditar', {
                        url: '/naturezaeditar/:id',
                        templateUrl: 'paginas/natureza/natureza.html',
                        controller: 'NaturezaController',
                        resolve: {
                            entidade: function ($http, $stateParams) {
                                return $http.get(url2.concat('/' + $stateParams.id))
                            }
                        }
                    })
                    
                                                            ////                Pagamento


                    .state('pagamento', {
                        url: '/pagamento',
                        templateUrl: 'paginas/pagamento/pagamento.html',
                        controller: 'PagamentoController',
                        resolve: {
                            entidade: function () {
                                return {};
                            }
                        }
                    })
                    .state('pagamentolistagem', {
                        url: '/pagamentolistagem',
                        templateUrl: 'paginas/pagamento/listar.html',
                        controller: 'PagamentoListarController'
                    })
                    .state('pagamentoeditar', {
                        url: '/pagamentoeditar/:id',
                        templateUrl: 'paginas/pagamento/pagamento.html',
                        controller: 'PagamentoController',
                        resolve: {
                            entidade: function ($http, $stateParams) {
                                return $http.get(url.concat('/' + $stateParams.id))
                            }
                        }
                    })
                    
                    //           Pessoa
                    
                    .state('pessoa', {
                        url: '/pessoa',
                        templateUrl: 'paginas/pessoa/pessoa.html',
                        controller: 'PessoaController',
                        resolve: {
                            entidade: function () {
                                return {};
                            }
                        }
                    })
                    .state('pessoalistagem', {
                        url: '/pessoalistagem',
                        templateUrl: 'paginas/pessoa/listar.html',
                        controller: 'PessoaListarController'
                    })
                    .state('pessoaeditar', {
                        url: '/pessoaeditar/:id',
                        templateUrl: 'paginas/pessoa/pessoa.html',
                        controller: 'PessoaController',
                        resolve: {
                            entidade: function ($http, $stateParams) {
                                return $http.get(url.concat('/' + $stateParams.id))
                            }
                        }
                    })
                    
                    //                 Saldo
                    
                    .state('saldo', {
                        url: '/saldo',
                        templateUrl: 'paginas/saldo/saldo.html',
                        controller: 'SaldoController',
                        resolve: {
                            entidade: function () {
                                return {};
                            }
                        }
                    })
                    .state('saldolistagem', {
                        url: '/saldolistagem',
                        templateUrl: 'paginas/saldo/listar.html',
                        controller: 'SaldoListarController'
                    })
                    .state('saldoeditar', {
                        url: '/saldoeditar/:id',
                        templateUrl: 'paginas/saldo/saldo.html',
                        controller: 'SaldoController',
                        resolve: {
                            entidade: function ($http, $stateParams) {
                                return $http.get(url.concat('/' + $stateParams.id))
                            }
                        }
                    })
                    
                    //                 Tipo de Titulo
                    
                    .state('tipoTitulo', {
                        url: '/tipoTitulo',
                        templateUrl: 'paginas/tipoTitulo/tipoTitulo.html',
                        controller: 'TipoTituloController',
                        resolve: {
                            entidade: function () {
                                return {};
                            }
                        }
                    })
                    .state('tipoTitulolistagem', {
                        url: '/tipoTitulolistagem',
                        templateUrl: 'paginas/tipoTitulo/listar.html',
                        controller: 'TipoTituloListarController'
                    })
                    .state('tipoTituloeditar', {
                        url: '/tipoTituloeditar/:id',
                        templateUrl: 'paginas/tipoTitulo/tipoTitulo.html',
                        controller: 'TipoTituloController',
                        resolve: {
                            entidade: function ($http, $stateParams) {
                                return $http.get(url.concat('/' + $stateParams.id))
                            }
                        }
                    })
                    
                    //                 Titulo
                    
                    .state('titulo', {
                        url: '/titulo',
                        templateUrl: 'paginas/titulo/titulo.html',
                        controller: 'TituloController',
                        resolve: {
                            entidade: function () {
                                return {};
                            }
                        }
                    })
                    .state('titulolistagem', {
                        url: '/titulolistagem',
                        templateUrl: 'paginas/titulo/listar.html',
                        controller: 'TituloListarController'
                    })
                    .state('tituloeditar', {
                        url: '/tituloeditar/:id',
                        templateUrl: 'paginas/titulo/titulo.html',
                        controller: 'TituloController',
                        resolve: {
                            entidade: function ($http, $stateParams) {
                                return $http.get(url.concat('/' + $stateParams.id))
                            }
                        }
                    })
        })
