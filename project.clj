(defproject build-cop-bot "0.1.0"
  :description "FIXME: write description"
  :url "https://github.com/tkshnwesper/build-cop-bot"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.0"]]
  :main ^:skip-aot build-cop-bot.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
