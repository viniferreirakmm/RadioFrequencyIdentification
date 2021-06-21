package service;

import jssc.SerialPortList;

public class GetConnection {

    private void GetDisposablePorts() {
        String[] ports = SerialPortList.getPortNames();
        for(int i = 0; i < ports.length(); i++) {
            System.out.println(ports[i]);
        }
    }

}
