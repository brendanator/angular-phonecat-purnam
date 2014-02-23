(ns angular-phonecat-purnam.services
  (:use-macros
   [purnam.js :only [obj]]
   [purnam.angular :only [def.module def.factory]]))

(def.module phonecatServices [ngResource])

(def.factory phonecatServices.Phone [$resource]
  ($resource 
    "phones/:phoneId.json" 
    (obj)
    (obj :query {:method "GET", 
                 :params {:phoneId "phones"} 
                 :isArray true})))
