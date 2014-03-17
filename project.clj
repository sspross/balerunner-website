(defproject balerunner "0.1.0"
  :description "official website of the balerunner game"
  :url "http://balerunner.ch"
  :min-lein-version "2.0.0"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/java.jdbc "0.3.3"]
                 [postgresql "9.1-901.jdbc4"]
                 [ring/ring-jetty-adapter "1.2.2"]
                 [compojure "1.1.6"]
                 [hiccup "1.0.5"]]
  :main ^:skip-aot balerunner.core
  :uberjar-name "balerunner-standalone.jar"
  :profiles {:uberjar {:aot :all}})
