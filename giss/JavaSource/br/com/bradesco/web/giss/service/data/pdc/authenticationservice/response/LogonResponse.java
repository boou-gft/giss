/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: LogonResponse.java,v 1.1 2017/04/11 14:10:03 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.authenticationservice.response;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class LogonResponse.
 * 
 * @version $Revision: 1.1 $ $Date: 2017/04/11 14:10:03 $
 */
public class LogonResponse implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _codRetorno
     */
    private java.lang.String _codRetorno;

    /**
     * Field _msgRetorno
     */
    private java.lang.String _msgRetorno;

    /**
     * Field _idUsuario
     */
    private java.lang.String _idUsuario;

    /**
     * Field _nomeUsuario
     */
    private java.lang.String _nomeUsuario;

    /**
     * Field _tipoUsuario
     */
    private java.lang.String _tipoUsuario;

    /**
     * Field _codEmpresa
     */
    private java.lang.String _codEmpresa;

    /**
     * Field _codDependencia
     */
    private java.lang.String _codDependencia;

    /**
     * Field _codSecao
     */
    private java.lang.String _codSecao;

    /**
     * Field _tipoAlcada
     */
    private java.lang.String _tipoAlcada;

    /**
     * Field _maisPerfil
     */
    private java.lang.String _maisPerfil;

    /**
     * Field _qtdPerfilAdicional
     */
    private java.lang.String _qtdPerfilAdicional;

    /**
     * Field _perfil
     */
    private br.com.bradesco.web.giss.service.data.pdc.authenticationservice.response.Perfil _perfil;


      //----------------/
     //- Constructors -/
    //----------------/

    public LogonResponse() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.authenticationservice.response.LogonResponse()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'codDependencia'.
     * 
     * @return String
     * @return the value of field 'codDependencia'.
     */
    public java.lang.String getCodDependencia()
    {
        return this._codDependencia;
    } //-- java.lang.String getCodDependencia() 

    /**
     * Returns the value of field 'codEmpresa'.
     * 
     * @return String
     * @return the value of field 'codEmpresa'.
     */
    public java.lang.String getCodEmpresa()
    {
        return this._codEmpresa;
    } //-- java.lang.String getCodEmpresa() 

    /**
     * Returns the value of field 'codRetorno'.
     * 
     * @return String
     * @return the value of field 'codRetorno'.
     */
    public java.lang.String getCodRetorno()
    {
        return this._codRetorno;
    } //-- java.lang.String getCodRetorno() 

    /**
     * Returns the value of field 'codSecao'.
     * 
     * @return String
     * @return the value of field 'codSecao'.
     */
    public java.lang.String getCodSecao()
    {
        return this._codSecao;
    } //-- java.lang.String getCodSecao() 

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
     * Returns the value of field 'maisPerfil'.
     * 
     * @return String
     * @return the value of field 'maisPerfil'.
     */
    public java.lang.String getMaisPerfil()
    {
        return this._maisPerfil;
    } //-- java.lang.String getMaisPerfil() 

    /**
     * Returns the value of field 'msgRetorno'.
     * 
     * @return String
     * @return the value of field 'msgRetorno'.
     */
    public java.lang.String getMsgRetorno()
    {
        return this._msgRetorno;
    } //-- java.lang.String getMsgRetorno() 

    /**
     * Returns the value of field 'nomeUsuario'.
     * 
     * @return String
     * @return the value of field 'nomeUsuario'.
     */
    public java.lang.String getNomeUsuario()
    {
        return this._nomeUsuario;
    } //-- java.lang.String getNomeUsuario() 

    /**
     * Returns the value of field 'perfil'.
     * 
     * @return Perfil
     * @return the value of field 'perfil'.
     */
    public br.com.bradesco.web.giss.service.data.pdc.authenticationservice.response.Perfil getPerfil()
    {
        return this._perfil;
    } //-- br.com.bradesco.web.giss.service.data.pdc.authenticationservice.response.Perfil getPerfil() 

    /**
     * Returns the value of field 'qtdPerfilAdicional'.
     * 
     * @return String
     * @return the value of field 'qtdPerfilAdicional'.
     */
    public java.lang.String getQtdPerfilAdicional()
    {
        return this._qtdPerfilAdicional;
    } //-- java.lang.String getQtdPerfilAdicional() 

    /**
     * Returns the value of field 'tipoAlcada'.
     * 
     * @return String
     * @return the value of field 'tipoAlcada'.
     */
    public java.lang.String getTipoAlcada()
    {
        return this._tipoAlcada;
    } //-- java.lang.String getTipoAlcada() 

    /**
     * Returns the value of field 'tipoUsuario'.
     * 
     * @return String
     * @return the value of field 'tipoUsuario'.
     */
    public java.lang.String getTipoUsuario()
    {
        return this._tipoUsuario;
    } //-- java.lang.String getTipoUsuario() 

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
     * Sets the value of field 'codDependencia'.
     * 
     * @param codDependencia the value of field 'codDependencia'.
     */
    public void setCodDependencia(java.lang.String codDependencia)
    {
        this._codDependencia = codDependencia;
    } //-- void setCodDependencia(java.lang.String) 

    /**
     * Sets the value of field 'codEmpresa'.
     * 
     * @param codEmpresa the value of field 'codEmpresa'.
     */
    public void setCodEmpresa(java.lang.String codEmpresa)
    {
        this._codEmpresa = codEmpresa;
    } //-- void setCodEmpresa(java.lang.String) 

    /**
     * Sets the value of field 'codRetorno'.
     * 
     * @param codRetorno the value of field 'codRetorno'.
     */
    public void setCodRetorno(java.lang.String codRetorno)
    {
        this._codRetorno = codRetorno;
    } //-- void setCodRetorno(java.lang.String) 

    /**
     * Sets the value of field 'codSecao'.
     * 
     * @param codSecao the value of field 'codSecao'.
     */
    public void setCodSecao(java.lang.String codSecao)
    {
        this._codSecao = codSecao;
    } //-- void setCodSecao(java.lang.String) 

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
     * Sets the value of field 'maisPerfil'.
     * 
     * @param maisPerfil the value of field 'maisPerfil'.
     */
    public void setMaisPerfil(java.lang.String maisPerfil)
    {
        this._maisPerfil = maisPerfil;
    } //-- void setMaisPerfil(java.lang.String) 

    /**
     * Sets the value of field 'msgRetorno'.
     * 
     * @param msgRetorno the value of field 'msgRetorno'.
     */
    public void setMsgRetorno(java.lang.String msgRetorno)
    {
        this._msgRetorno = msgRetorno;
    } //-- void setMsgRetorno(java.lang.String) 

    /**
     * Sets the value of field 'nomeUsuario'.
     * 
     * @param nomeUsuario the value of field 'nomeUsuario'.
     */
    public void setNomeUsuario(java.lang.String nomeUsuario)
    {
        this._nomeUsuario = nomeUsuario;
    } //-- void setNomeUsuario(java.lang.String) 

    /**
     * Sets the value of field 'perfil'.
     * 
     * @param perfil the value of field 'perfil'.
     */
    public void setPerfil(br.com.bradesco.web.giss.service.data.pdc.authenticationservice.response.Perfil perfil)
    {
        this._perfil = perfil;
    } //-- void setPerfil(br.com.bradesco.web.giss.service.data.pdc.authenticationservice.response.Perfil) 

    /**
     * Sets the value of field 'qtdPerfilAdicional'.
     * 
     * @param qtdPerfilAdicional the value of field
     * 'qtdPerfilAdicional'.
     */
    public void setQtdPerfilAdicional(java.lang.String qtdPerfilAdicional)
    {
        this._qtdPerfilAdicional = qtdPerfilAdicional;
    } //-- void setQtdPerfilAdicional(java.lang.String) 

    /**
     * Sets the value of field 'tipoAlcada'.
     * 
     * @param tipoAlcada the value of field 'tipoAlcada'.
     */
    public void setTipoAlcada(java.lang.String tipoAlcada)
    {
        this._tipoAlcada = tipoAlcada;
    } //-- void setTipoAlcada(java.lang.String) 

    /**
     * Sets the value of field 'tipoUsuario'.
     * 
     * @param tipoUsuario the value of field 'tipoUsuario'.
     */
    public void setTipoUsuario(java.lang.String tipoUsuario)
    {
        this._tipoUsuario = tipoUsuario;
    } //-- void setTipoUsuario(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return LogonResponse
     */
    public static br.com.bradesco.web.giss.service.data.pdc.authenticationservice.response.LogonResponse unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.authenticationservice.response.LogonResponse) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.authenticationservice.response.LogonResponse.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.authenticationservice.response.LogonResponse unmarshal(java.io.Reader) 

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
