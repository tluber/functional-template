(ns exercise9)


(def strin "Soy un String")
(def vect "Soy un Vector")
(def mapa "Soy un Map")
(def deflt "Soy un default")

(defmulti things (fn [x] (type x)))

(defmethod things clojure.lang.PersistentArrayMap [x] mapa)
          
(defmethod things clojure.lang.PersistentVector [x] vect)
  
(defmethod things java.lang.String [x] strin)

(defmethod things java.lang.Long [x] deflt)

