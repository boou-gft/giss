package br.com.bradesco.web.giss.view.bean.controller.balancetes.obrigacoesWebservice;


import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.UUID;

public class HttpPostMultipart {
    private final String boundary;// boundary
    private static final String LINE = "\r\n";// linha
    private HttpURLConnection httpConnection = null;
    private String charset = null;
    private OutputStream outputStream = null;
    private PrintWriter writer = null;
    private static final String DESTINO_URL = "DESTINO_URL";

    /**
     * Este construtor inicializa uma nova requisição HTTP POST com
     * content type multipart/form-data
     *
     * @param requestURL
     * @param charset
     * @param headers
     * @throws IOException
     */
    public HttpPostMultipart(String requestURL, String charset, String urlDestino) throws IOException {
        this.charset = charset;
        boundary = UUID.randomUUID().toString();
        URL url = new URL(requestURL);
        httpConnection = (HttpURLConnection) url.openConnection();
        httpConnection.setUseCaches(false);
        httpConnection.setDoOutput(true);    // indicates POST method
        httpConnection.setDoInput(true);
        httpConnection.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + boundary);
        httpConnection.setRequestProperty(DESTINO_URL, urlDestino);
     
        outputStream = httpConnection.getOutputStream();
        writer = new PrintWriter(new OutputStreamWriter(outputStream, charset), true);
    }

    /**
     * Adiciona um form field na requisição
     *
     * @param name  nome do campo
     * @param value valor do campo
     */
    public void addFormField(String name, String value) {
        writer.append("--" + boundary).append(LINE);
        writer.append("Content-Disposition: form-data; name=\"" + name + "\"").append(LINE);
        writer.append("Content-Type: text/plain; charset=" + charset).append(LINE);
        writer.append(LINE);
        writer.append(value).append(LINE);
        writer.flush();
    }

    /**
     * Adiciona uma seção de arquivo de upload na requisição
     *
     * @param fieldName
     * @param uploadFile
     * @throws IOException
     */
    public void addFilePart(String fieldName, String str, String fileName)
            throws IOException {
        writer.append("--" + boundary).append(LINE);
        writer.append("Content-Disposition: form-data; name=\"" + fieldName + "\"; filename=\"" + fileName + "\"").append(LINE);
        writer.append("Content-Type: " + URLConnection.guessContentTypeFromName(fileName)).append(LINE);
        writer.append("Content-Transfer-Encoding: binary").append(LINE);
        writer.append(LINE);
        writer.flush();

        InputStream stream = new ByteArrayInputStream(str.getBytes("UTF-8"));
        byte[] buffer = new byte[4096];
        int bytesRead = -1;
        while ((bytesRead = stream.read(buffer)) != -1) {
            outputStream.write(buffer, 0, bytesRead);
        }
        outputStream.flush();
        stream.close();
        writer.append(LINE);
        writer.flush();
    }

    /**
     * Completa a requisição e recebe a resposta do servidor
     *
     * @return String como resposta caso o servidor retorne
     * status OK, caso contrário uma exceção é lançada
     * @throws IOException
     */
    public String finish() throws IOException {
        String response = "";
        writer.flush();
        writer.append("--" + boundary + "--").append(LINE);
        writer.close();

        InputStream inputStream = null;
        ByteArrayOutputStream result = null;
        
        try {
        	// Verifica o status do servidor
            int status = httpConnection.getResponseCode();
            if (status == HttpURLConnection.HTTP_OK) {
                inputStream = httpConnection.getInputStream();
                result = new ByteArrayOutputStream();
                byte[] buffer = new byte[1024];
                int length;
                while ((length = inputStream.read(buffer)) != -1) {
                    result.write(buffer, 0, length);
                }
                response = result.toString(this.charset);
            } else {
                throw new IOException("O Webservice retornou status não-OK: " + status);
            }
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.getMessage();
                }
            }

            if (result != null) {
                try {
                    result.close();
                } catch (IOException e) {
                    e.getMessage();
                }
            }

            if (httpConnection != null) {
                httpConnection.disconnect();
            }
        }
        return response;
    }
    
}
