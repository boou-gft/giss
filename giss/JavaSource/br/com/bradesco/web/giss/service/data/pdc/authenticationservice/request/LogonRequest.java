/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: LogonRequest.java,v 1.1 2017/04/11 14:08:24 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.authenticationservice.request;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class LogonRequest.
 * 
 * @version $Revision: 1.1 $ $Date: 2017/04/11 14:08:24 $
 */
public class LogonRequest implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _idUsuario
     */
    private java.lang.String _idUsuario;

    /**
     * Field _senhaAtual
     */
    private java.lang.String _senhaAtual;

    /**
     * Field _senhaNova
     */
    private java.lang.String _senhaNova;

    /**
     * Field _senhaConfirmacao
     */
    private java.lang.String _senhaConfirmacao;

    /**
     * Field _atualizarSenha
     */
    private java.lang.String _atualizarSenha = "N";


      //----------------/
     //- Constructors -/
    //----------------/

    public LogonRequest() 
     {
        super();
        setAtualizarSenha("N");
    } //-- br.com.bradesco.web.giss.service.data.pdc.authenticationservice.request.LogonRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'atualizarSenha'.
     * 
     * @return String
     * @return the value of field 'atualizarSenha'.
     */
    public java.lang.String getAtualizarSenha()
    {
        return this._atualizarSenha;
    } //-- java.lang.String getAtualizarSenha() 

    /**
     * Returns the value of field 'idUsuario'.
     * 
     * @return String
     * @return the value of field 'idUsuario'.
     */
    public java.lang.String getIdUsuario()
    {
        return this._idUsuario;
    } //-- java.lang.String getIdUsuario() 

    /**
     * Returns the value of field 'senhaAtual'.
     * 
     * @return String
     * @return the value of field 'senhaAtual'.
     */
    public java.lang.String getSenhaAtual()
    {
        return this._senhaAtual;
    } //-- java.lang.String getSenhaAtual() 

    /**
     * Returns the value of field 'senhaConfirmacao'.
     * 
     * @return String
     * @return the value of field 'senhaConfirmacao'.
     */
    public java.lang.String getSenhaConfirmacao()
    {
        return this._senhaConfirmacao;
    } //-- java.lang.String getSenhaConfirmacao() 

    /**
     * Returns the value of field 'senhaNova'.
     * 
     * @return String
     * @return the value of field 'senhaNova'.
     */
    public java.lang.String getSenhaNova()
    {
        return this._senhaNova;
    } //-- java.lang.String getSenhaNova() 

    /**
     * Method isValid
     * 
     * 
     * 
     * @return boolean
     */
    public boolean isValid()
    {
        try {
            validate();
        }
        catch (org.exolab.castor.xml.ValidationException vex) {
            return false;
        }
        return true;
    } //-- boolean isValid() 

    /**
     * Method marshal
     * 
     * 
     * 
     * @param out
     */
    public void marshal(java.io.Writer out)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        
        Marshaller.marshal(this, out);
    } //-- void marshal(java.io.Writer) 

    /**
     * Method marshal
     * 
     * 
     * 
     * @param handler
     */
    public void marshal(org.xml.sax.ContentHandler handler)
        throws java.io.IOException, org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        
        Marshaller.marshal(this, handler);
    } //-- void marshal(org.xml.sax.ContentHandler) 

    /**
     * Sets the value of field 'atualizarSenha'.
     * 
     * @param atualizarSenha the value of field 'atualizarSenha'.
     */
    public void setAtualizarSenha(java.lang.String atualizarSenha)
    {
        this._atualizarSenha = atualizarSenha;
    } //-- void setAtualizarSenha(java.lang.String) 

    /**
     * Sets the value of field 'idUsuario'.
     * 
     * @param idUsuario the value of field 'idUsuario'.
     */
    public void setIdUsuario(java.lang.String idUsuario)
    {
        this._idUsuario = idUsuario;
    } //-- void setIdUsuario(java.lang.String) 

    /**
     * Sets the value of field 'senhaAtual'.
     * 
     * @param senhaAtual the value of field 'senhaAtual'.
     */
    public void setSenhaAtual(java.lang.String senhaAtual)
    {
        this._senhaAtual = senhaAtual;
    } //-- void setSenhaAtual(java.lang.String) 

    /**
     * Sets the value of field 'senhaConfirmacao'.
     * 
     * @param senhaConfirmacao the value of field 'senhaConfirmacao'
     */
    public void setSenhaConfirmacao(java.lang.String senhaConfirmacao)
    {
        this._senhaConfirmacao = senhaConfirmacao;
    } //-- void setSenhaConfirmacao(java.lang.String) 

    /**
     * Sets the value of field 'senhaNova'.
     * 
     * @param senhaNova the value of field 'senhaNova'.
     */
    public void setSenhaNova(java.lang.String senhaNova)
    {
        this._senhaNova = senhaNova;
    } //-- void setSenhaNova(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return LogonRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.authenticationservice.request.LogonRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.authenticationservice.request.LogonRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.authenticationservice.request.LogonRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.authenticationservice.request.LogonRequest unmarshal(java.io.Reader) 

    /**
     * Method validate
     * 
     */
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
