(ns learn.exercism.log-levels
  (:require [clojure.string]))

(defn message [s] (-> s
                      (clojure.string/replace #"\[\w+\]: " "")
                      (clojure.string/trim)))

(defn log-level [s] (-> s
                        (clojure.string/replace #".*\[(\w+)\].*" "$1")
                        (clojure.string/lower-case)))

(defn reformat [s] (-> s
                       (clojure.string/replace #"\[\w+\]: " "")
                       (clojure.string/trim)
                       (str " (" (-> s
                                     (clojure.string/replace #".*\[(\w+)\].*" "$1")
                                     (clojure.string/trim)
                                     (clojure.string/lower-case)) ")")))
