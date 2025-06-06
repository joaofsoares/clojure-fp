(ns learn.exercism.cars-assemble-test
  (:require [clojure.test :refer [deftest is testing]]
            [learn.exercism.cars-assemble :refer [production-rate working-items]]))

(deftest production-rate-test-1
  (testing "production rate"
    (is (= (production-rate 1) 221))))

(deftest production-rate-test-2
  (testing "production rate"
    (is (= (production-rate 6) 1193.4))))

(deftest working-items-1
  (testing "working items"
    (is (= (working-items 6) 19))))
