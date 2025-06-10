(ns learn.exercism.collatz-conjecture)

(defn- collatz-helper [num steps] (cond
                                    (= num 1) steps
                                    (even? num) (recur (/ num 2) (inc steps))
                                    :else (recur (+ (* num 3) 1) (inc steps))))

(defn collatz [num] (collatz-helper num 0))

