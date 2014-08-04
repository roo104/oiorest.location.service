package dk.unwire.mticket.oiorest.location.service;

import com.unwire.mticket.net.http.execute.ConnectionException;
import com.unwire.mticket.net.http.repsonse.ResponseException;

import dk.unwire.mticket.oiorest.location.service.model.Stop;
import dk.unwire.mticket.oiorest.location.service.service.StopService;

public class Main {

	public static void main(String[] args) throws ResponseException, ConnectionException {
		StopService stopService = new StopService();

		Stop[] stops = stopService.getStop("nørreport");


		//		String json = "[{\"holdepladsnr\":\"10549\",\"navn\":\"Norreport st (bus)\",\"type\":{\"nr\":\"4\",\"navn\":\"Busholdeplads\",\"ikon\":\"http:\\/\\/geo.oiorest.dk\\/img\\/RP_pictogram_bus_web.gif\"},\"etrs89koordinat\":{\"ost\":\"724580\",\"nord\":\"6176647\"},\"wgs84koordinat\":{\"bredde\":\"55.6835543900383\",\"laengde\":\"12.5726094042726\"},\"rejseplanen\":{\"herfra\":\"http:\\/\\/www.rejseplanen.dk\\/bin\\/query.exe\\/mn?S=10549&start=yes\",\"hertil\":\"http:\\/\\/www.rejseplanen.dk\\/bin\\/query.exe\\/mn?Z=10549&start=yes\",\"herframobil\":\"http:\\/\\/www.rejseplanen.dk\\/mobil-bin\\/query.exe\\/mox?S=10549&start=yes\",\"hertilmobil\":\"http:\\/\\/www.rejseplanen.dk\\/mobil-bin\\/query.exe\\/mox?Z=10549&start=yes\",\"afgangstavle\":\"http:\\/\\/www.rejseplanen.dk\\/bin\\/stboard.exe\\/mn?ml=m&input=10549&boardType=dep&time=now&start=yes\",\"ankomsttavle\":\"http:\\/\\/www.rejseplanen.dk\\/bin\\/stboard.exe\\/mn?ml=m&input=10549&boardType=arr&time=now&start=yes\"}},{\"holdepladsnr\":\"48482\",\"navn\":\"Norreport st (bus)\",\"type\":{\"nr\":\"4\",\"navn\":\"Busholdeplads\",\"ikon\":\"http:\\/\\/geo.oiorest.dk\\/img\\/RP_pictogram_bus_web.gif\"},\"etrs89koordinat\":{\"ost\":\"724498\",\"nord\":\"6176542\"},\"wgs84koordinat\":{\"bredde\":\"55.6826506694819\",\"laengde\":\"12.5712218809844\"},\"rejseplanen\":{\"herfra\":\"http:\\/\\/www.rejseplanen.dk\\/bin\\/query.exe\\/mn?S=48482&start=yes\",\"hertil\":\"http:\\/\\/www.rejseplanen.dk\\/bin\\/query.exe\\/mn?Z=48482&start=yes\",\"herframobil\":\"http:\\/\\/www.rejseplanen.dk\\/mobil-bin\\/query.exe\\/mox?S=48482&start=yes\",\"hertilmobil\":\"http:\\/\\/www.rejseplanen.dk\\/mobil-bin\\/query.exe\\/mox?Z=48482&start=yes\",\"afgangstavle\":\"http:\\/\\/www.rejseplanen.dk\\/bin\\/stboard.exe\\/mn?ml=m&input=48482&boardType=dep&time=now&start=yes\",\"ankomsttavle\":\"http:\\/\\/www.rejseplanen.dk\\/bin\\/stboard.exe\\/mn?ml=m&input=48482&boardType=arr&time=now&start=yes\"}},{\"holdepladsnr\":\"48483\",\"navn\":\"Norreport st (bus)\",\"type\":{\"nr\":\"4\",\"navn\":\"Busholdeplads\",\"ikon\":\"http:\\/\\/geo.oiorest.dk\\/img\\/RP_pictogram_bus_web.gif\"},\"etrs89koordinat\":{\"ost\":\"724621\",\"nord\":\"6176704\"},\"wgs84koordinat\":{\"bredde\":\"55.6840465997412\",\"laengde\":\"12.5733068742421\"},\"rejseplanen\":{\"herfra\":\"http:\\/\\/www.rejseplanen.dk\\/bin\\/query.exe\\/mn?S=48483&start=yes\",\"hertil\":\"http:\\/\\/www.rejseplanen.dk\\/bin\\/query.exe\\/mn?Z=48483&start=yes\",\"herframobil\":\"http:\\/\\/www.rejseplanen.dk\\/mobil-bin\\/query.exe\\/mox?S=48483&start=yes\",\"hertilmobil\":\"http:\\/\\/www.rejseplanen.dk\\/mobil-bin\\/query.exe\\/mox?Z=48483&start=yes\",\"afgangstavle\":\"http:\\/\\/www.rejseplanen.dk\\/bin\\/stboard.exe\\/mn?ml=m&input=48483&boardType=dep&time=now&start=yes\",\"ankomsttavle\":\"http:\\/\\/www.rejseplanen.dk\\/bin\\/stboard.exe\\/mn?ml=m&input=48483&boardType=arr&time=now&start=yes\"}}]";
		//		Stop[] stops = JsonUtil.factoryFromString(json, Stop[].class);
		System.out.println(stops[0].getStopNumber());
		System.out.println(stops[0].getName());
		System.out.println(stops[0].getWgs84coordinat().getLongitude());
		System.out.println(stops[0].getWgs84coordinat().getLatitude());
	}

}
