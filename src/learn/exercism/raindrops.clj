(ns learn.exercism.raindrops)

(defn convert [num] (let [a (= 0 (mod num 7))
                          b (= 0 (mod num 5))
                          c (= 0 (mod num 3))]
                      (cond
                        (every? true? [a b c]) "PlingPlangPlong"
                        (every? true? [a b]) "PlangPlong"
                        (every? true? [a c]) "PlingPlong"
                        (every? true? [b c]) "PlingPlang"
                        (true? a) "Plong"
                        (true? b) "Plang"
                        (true? c) "Pling"
                        :else (str num))))
