(ns learn.exercism.anagram
  (:require [clojure.string :as string]))

(defn- format-word [word]
  (apply str (sort (string/lower-case word))))

(defn- not-same [word1 word2]
  (and (not= word1 word2) (not= (string/lower-case word1) (string/lower-case word2))))

(defn- is-anagram? [word candidate]
  (and (not-same word candidate) (= (format-word word) (format-word candidate))))

(defn anagrams-for
  "Returns all words from candidates that are anagrams of the given word."
  [word candidates]
  (filter #(is-anagram? word %) candidates))
