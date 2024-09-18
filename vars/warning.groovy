def call(Map config = [:]) {
  hello(name: "Kanha Phol", dayOfWeek:"Monday")
  
  sh " echo Hello ${message}. "
}
