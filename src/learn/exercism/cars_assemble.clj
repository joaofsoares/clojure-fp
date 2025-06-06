(ns learn.exercism.cars-assemble)

(def rate-per-hour 221)

(defn production-rate [speed] (cond (<= speed 0) 0
                                    (<= speed 4) (* rate-per-hour speed)
                                    (<= speed 8) (* rate-per-hour speed 0.9)
                                    (<= speed 9) (* rate-per-hour speed 0.8)
                                    :else (* rate-per-hour speed 0.77)))

(defn working-items [speed] (int (quot (production-rate speed) 60)))
