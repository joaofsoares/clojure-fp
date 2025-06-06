(ns learn.exercism.difference-of-squares)

(defn square-of-sum [n] (let [x (quot (* n (+ n 1)) 2)]
                          (* x x)))

(defn sum-of-squares [n] (quot (* n (+ n 1) (+ (* n 2) 1)) 6))

(defn difference [n] (let [x (square-of-sum n)
                           y (sum-of-squares n)]
                       (cond (> x y) (- x y)
                             (< x y) (- y x)
                             :else 0)))
