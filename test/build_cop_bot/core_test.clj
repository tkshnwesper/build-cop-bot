(ns build-cop-bot.core-test
  (:require [clojure.test :refer :all]
            [build-cop-bot.core :refer :all]))

(deftest read-config-test
  (testing "property :a from config file is read correctly"
    (is (= (:a (build-cop-bot.core/read-config "test_config.edn")) "meow"))))
