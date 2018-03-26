(ns exercise7)


(defn fmap [f x]
  (if (map? x)
    (map (fn [[k v]] {k (inc v)}) x)  
    (map f x))  
)

