(defproject concurrent-primes "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/core.async "0.1.278.0-76b25b-alpha"]]
  :aot [concurrent-primes.core]
  :main concurrent-primes.core)
  ;; :profiles {:uberjar {:aot :all}})
