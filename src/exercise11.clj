(ns exercise11)

(defn fmap-nil [x y]
  (def valor (get x y))
  (= valor nil)
)
