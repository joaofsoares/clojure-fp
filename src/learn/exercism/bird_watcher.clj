(ns learn.exercism.bird-watcher)

(def last-week
  [0 2 5 3 7 8 4])

(defn today [birds]
  (last birds))

(defn inc-bird [birds]
  (conj (pop birds) (+ 1 (today birds))))

(defn day-without-birds? [birds]
  (not (nil? (some #(= 0 %) birds))))

(defn n-days-count [birds n]
  (reduce + (subvec birds 0 n)))

(defn busy-days [birds]
  (count (filter #(>= % 5) birds)))

(defn- is-pattern? [birds]
  (every? #(and (number? %) (or (= % 0) (= % 1))) birds))

(defn odd-week? [birds]
  (cond
    (is-pattern? birds) (odd? (count birds))
    :else false))

