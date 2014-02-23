(ns angular-phonecat-purnam.filter
  (:use-macros
   [purnam.angular :only [def.module def.filter]]))

(def.module phonecatFilters [])

(def.filter phonecatFilters.checkmark []
  (fn [input] (if input '\u2713 '\u2718)))
