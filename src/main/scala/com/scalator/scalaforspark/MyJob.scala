package com.scalator.scalaforspark

import org.apache.spark.SparkContext
import org.apache.spark.rdd.RDD

/**
  * Make tests pass by completing TODOs
  */
class MyJob(sc: SparkContext) {

  // TODO: Create RDD with numbers from 1 to n
  def createRDD(n: Int): RDD[Int] = {
    ???
  }

  // TODO: Create RDD with strings present in file with given name
  def createRDDFromFile(name: String): RDD[String] = {
    ???
  }

}
