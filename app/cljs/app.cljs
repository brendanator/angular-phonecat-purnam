(ns angular-phonecat-purnam.app
  (:use [purnam.cljs :only [aget-in aset-in]])
  (:use-macros
   [purnam.js :only [obj]]
   [purnam.angular :only [def.module def.config]]))

(def.module phonecatApp [ngRoute
                         phonecatAnimations
                         phonecatControllers
                         phonecatFilters
                         phonecatServices])


(def.config phonecatApp [$routeProvider]
  (doto $routeProvider
    (.when "/phones" 
       (obj :templateUrl "partials/phone-list.html"
            :controller "PhoneListCtrl"))
    (.when "/phones/:phoneId"
       (obj :templateUrl "partials/phone-detail.html"
            :controller "PhoneDetailCtrl"))
    (.otherwise (obj :redirectTo "/phones"))))
