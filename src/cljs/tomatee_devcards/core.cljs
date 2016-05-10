(ns tomatee-devcards.core
  (:require
   [devcards.core :as dc :include-macros true]
   [reagent.core :as reagent]
   [tomatee.views :as views])
  (:require-macros [devcards.core :refer [defcard defcard-rg deftest tests]]
                   [cljs.test :refer [is testing async]]))

(enable-console-print!)

(defcard-rg static-timer
  (views/timer))

(defn main []
  (dc/start-devcard-ui!))
