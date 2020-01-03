(ns build-cop-bot.core
  (:require [clojure.edn]
            [clojure.java.io])
  (:gen-class))

(defn read-config
  [file-name]
  (clojure.edn/read-string (slurp (clojure.java.io/resource file-name))))

(defn -main
  [& args]
  (println "Hello, World!"))
