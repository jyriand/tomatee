(ns tomatee.core-test
  (:require [tomatee.core :as sut]
            [cljs.test :refer-macros [deftest testing is]]))

(deftest numbers-should-equal
  (testing "something different"
    (is (= 2 3))))
