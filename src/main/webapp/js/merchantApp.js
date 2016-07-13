
var app=angular.module("merchantHomeApp",[]);

app.config(['$routeProvider',
            function($routeProvider) {
          	
              $routeProvider.
                when('/MerchantAddProduct', {
                  templateUrl: '/CapStore2/merchant_add_product',                	
                  controller: 'MerchantAddProductController'
              })
          }]);
