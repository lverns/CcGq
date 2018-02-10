(defproject ccgq "0.1.0-SNAPSHOT"
  :description "A project to demonstrate a bug"
  :url "http://example.com/FIXME"
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main ^:skip-aot ccgq.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
