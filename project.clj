(defproject angular-phonecat-purnam "0.0.0-SNAPSHOT"
  :description "purnam angularjs example"
  :url "https://github.com/brendanator/angular-phonecat-purnam.git"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojurescript "0.0-2014"]
                 [im.chit/purnam "0.1.8"]]
  :plugins [[lein-cljsbuild "1.0.2"]]
  :cljsbuild
  {:builds  [{:source-paths ["src" "test"],
              :id "unit-test",
              :compiler {:pretty-print true,
                         :output-to "resources/public/js/test-angular-example.js",
                         :optimizations :whitespace}}
             {:source-paths ["app/cljs"],
              :id "run",
              :compiler {:pretty-print true,
                         :output-to "app/js/angular-phonecat-purnam.js",
                         :optimizations :whitespace}}]})
