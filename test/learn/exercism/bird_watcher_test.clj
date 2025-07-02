(ns learn.exercism.bird-watcher-test
  (:require [clojure.test :refer [deftest is]]
            [learn.exercism.bird-watcher :as bird-watcher]))

(deftest test-last-week
  (is (= [0 2 5 3 7 8 4] bird-watcher/last-week)))

(deftest test-today
  (is (= 7 (bird-watcher/today [1 2 3 4 5 6 7]))))

(deftest test-inc-bird
  (is (=  [6 5 5 11 2 5 1] (bird-watcher/inc-bird [6 5 5 11 2 5 0]))))

(deftest test-day-without-birds?
  (is (true? (bird-watcher/day-without-birds? [0 2 5 3 7 8 4])))
  (is (false? (bird-watcher/day-without-birds? [1 2 5 3 7 8 4]))))

(deftest test-n-days-count
  (is 14 (bird-watcher/n-days-count [2 5 0 7 4 1] 4)))

(deftest test-busy-days
  (is 2 (bird-watcher/busy-days [2 5 0 7 4 1])))

(deftest test-odd-week-one?
  (is (true? (bird-watcher/odd-week? [1 1 1 0 1 1 1]))))

(deftest test-odd-week-two?
  (is (false? (bird-watcher/odd-week? [2 2 1 0 1 1 1]))))
