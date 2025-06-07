(ns learn.exercism.bob
  (:require [clojure.string :as str]))

(defn isFilterEmpty? [s] (empty? (filter #(Character/isLetter %) s)))

(defn isYelling? [s] (and (not (isFilterEmpty? s)) (every? #(Character/isUpperCase %) (filter #(Character/isLetter %) s))))

(defn isQuestion? [s] (= \? (last s)))

(defn response-for [s] (let [x (str/trim s)]
                         (cond
                           (empty? x)  "Fine. Be that way!"
                           (and (not (isYelling? x)) (isQuestion? x)) "Sure."
                           (and (isYelling? x) (isQuestion? x)) "Calm down, I know what I'm doing!"
                           (and (isYelling? x) (not (isQuestion? x))) "Whoa, chill out!"
                           :else "Whatever.")))

