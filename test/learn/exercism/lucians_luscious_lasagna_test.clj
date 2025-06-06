(ns learn.exercism.lucians-luscious-lasagna-test
  (:require [clojure.test :refer [deftest is testing]]
            [learn.exercism.lucians-luscious-lasagna :refer [remaining-time prep-time total-time]]))

(deftest remaining-time-test
  (testing "remaining time"
    (is (= (remaining-time 20) 20))))

(deftest prep-time-test
  (testing "prep time"
    (is (= (prep-time 3) 6))
    (is (= (prep-time 0) 0))
    (is (= (prep-time 1) 2))))

(deftest total-time-test
  (testing "total time"
    (is (= (total-time 3 20) 26))
    (is (= (total-time 0 20) 20))
    (is (= (total-time 1 20) 22))
    (is (= (total-time 2 20) 24))))
