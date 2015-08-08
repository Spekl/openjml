(ns spekl-package-manager.check
 (:require [clojure.java.io :as io]
            [clojure.tools.logging :as log]))


(defcheck default
  (log/info  "The `openjml` package does not provide checks. Please install openjml-esc or openjml-rac.")
)

