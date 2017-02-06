import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.stream.ActorMaterializer
import akka.http.scaladsl.server.Directives._

/**
  * Created by d041254 on 2/3/17.
  */
object AkkaTest extends App {

  implicit val sys = ActorSystem("AkkaTest")
  implicit val actorMaterializer = ActorMaterializer()

  val route =
    pathSingleSlash {
      get {
        complete {
          "Hello world!"
        }
      }
    }

  Http().bindAndHandle(route,"localhost",8080)

  println("server started at 8080")

}
