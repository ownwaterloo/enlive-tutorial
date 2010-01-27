(ns tutorial.utils
  (:use [net.cgrand.enlive-html :as html]))

(defn render [t]
  (apply str t))

(defmacro block [sym]
  `(fn [n#] (if (nil? ~sym) n# ((html/substitute ~sym) n#))))

(defmacro maybe-content [sym]
  `(fn [n#] (if (nil? ~sym) n# ((html/content ~sym) n#))))