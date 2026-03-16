(ns learn.exercism.armstrong-numbers)

(defn- to-digit [number]
  (->> number
       (iterate #(quot % 10))
       (take-while pos?)
       (map #(rem % 10))))

(defn- expt [x n]
  (reduce * (repeat n x)))

(defn armstrong?
  "Returns true if the given number is an Armstrong number;
  otherwise, it returns false."
  [num]
  (let [n (to-digit num)]
    (->> n
         (map #(expt % (count n)))
         (reduce +)
         (= num))))
