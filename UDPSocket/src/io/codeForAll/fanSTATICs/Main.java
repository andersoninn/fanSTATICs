package io.codeForAll.fanSTATICs;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Main {
    public static void main(String[] args) {

        int foreignPort = 5000;  // porta externa
        int localPort = 8080; // porta local

        byte[] recvBuffer = new byte[1024]; // converte a mensage que chegou em bytes

        {
            try {
                DatagramSocket socket = new DatagramSocket(foreignPort);

                DatagramPacket receivePacket = new DatagramPacket(recvBuffer, recvBuffer.length);
                socket.receive(receivePacket);
                System.out.println("DataGram recebido " + receivePacket);

                String receivedData = new String(receivePacket.getData(), 0, receivePacket.getLength()).toUpperCase();
                // getData pra pegar os dados da posição 0 do array até a Data.length e depois transformar em String.
                System.out.println(receivedData);

                byte[] sendBuffer  = receivedData.getBytes();

                DatagramPacket sendPacket = new DatagramPacket(sendBuffer, sendBuffer.length, receivePacket.getAddress(), receivePacket.getPort());
                socket.send(sendPacket);

            } catch (SocketException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
