(ns learn.exercism.lucians-luscious-lasagna)

(def expected-time 40)

(defn remaining-time [actual-time] (- 40 actual-time))

(defn prep-time [num-layers] (* num-layers 2))

(defn total-time [num-layers actual-time] (+ (prep-time num-layers) actual-time))

