(ns learn.exercism.difference-of-squares-test
  (:require [clojure.test :refer [deftest is testing]]
            [learn.exercism.difference-of-squares :refer [square-of-sum sum-of-squares difference]]))

(deftest square-of-sum-test-1
  (testing "square of sum"
    (is (= (square-of-sum 10) 3025))))

(deftest sum-of-square-test-1
  (testing "sum of squares"
    (is (= (sum-of-squares 10) 385))))

(deftest difference-test-1
  (testing "difference"
    (is (= (difference 10) 2640))))
