(ns angular-phonecat-purnam.controllers
  (:use-macros
   [purnam.js :only [! ? obj]]
   [purnam.angular :only [def.module def.controller]]))

(def.module phonecatControllers [])

(def.controller phonecatControllers.PhoneListCtrl [$scope Phone]
  (! $scope.phones (Phone.query))
  (! $scope.orderProp "age"))

(def.controller phonecatControllers.PhoneDetailCtrl [$scope $routeParams Phone]
  (! $scope.phone 
    (Phone.get
      (obj :phoneId $routeParams.phoneId)
      (fn [phone]
        (! $scope.mainImageUrl (? phone.images.0)))))
  (! $scope.setImage 
    (fn [imageUrl]
      (! $scope.mainImageUrl imageUrl))))
