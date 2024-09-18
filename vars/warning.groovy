def call(Map config = [:]) {
  hello(name: "Kanha Phol", dayOfWeek:"Monday")
  loadlinux(name: "hello_world.sh")
  sh " ./hello_world.sh ${config.name}. ${config.dayOfWeek}. "
}
