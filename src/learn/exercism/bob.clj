(ns learn.exercism.bob
  (:require [clojure.string :as str]))

(defn- is-filter-empty? [s] (not-empty (filter #(Character/isLetter %) s)))

(defn is-yelling? [s] (and (is-filter-empty? s) (every? #(Character/isUpperCase %) (filter #(Character/isLetter %) s))))

(defn is-question? [s] (= \? (last s)))

(defn response-for [s] (let [x (str/trim s)]
                         (cond
                           (empty? x)  "Fine. Be that way!"
                           (and (not (is-yelling? x)) (is-question? x)) "Sure."
                           (and (is-yelling? x) (is-question? x)) "Calm down, I know what I'm doing!"
                           (and (is-yelling? x) (not (is-question? x))) "Whoa, chill out!"
                           :else "Whatever.")))
