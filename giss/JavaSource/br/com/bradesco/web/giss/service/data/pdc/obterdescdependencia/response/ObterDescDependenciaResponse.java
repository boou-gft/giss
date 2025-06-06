/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ObterDescDependenciaResponse.java,v 1.1 2017/04/11 14:11:06 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.obterdescdependencia.response;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class ObterDescDependenciaResponse.
 * 
 * @version $Revision: 1.1 $ $Date: 2017/04/11 14:11:06 $
 */
public class ObterDescDependenciaResponse implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _codMensagem
     */
    private java.lang.String _codMensagem;

    /**
     * Field _mensagem
     */
    private java.lang.String _mensagem;

    /**
     * Field _codEmpresa
     */
    private long _codEmpresa = 0;

    /**
     * keeps track of state for field: _codEmpresa
     */
    private boolean _has_codEmpresa;

    /**
     * Field _desDependencia
     */
    private java.lang.String _desDependencia;

    /**
     * Field _codDependencia
     */
    private int _codDependencia = 0;

    /**
     * keeps track of state for field: _codDependencia
     */
    private boolean _has_codDependencia;

    /**
     * Field _numSeqDependencia
     */
    private int _numSeqDependencia = 0;

    /**
     * keeps track of state for field: _numSeqDependencia
     */
    private boolean _has_numSeqDependencia;


      //----------------/
     //- Constructors -/
    //----------------/

    public ObterDescDependenciaResponse() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.obterdescdependencia.response.ObterDescDependenciaResponse()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodDependencia
     * 
     */
    public void deleteCodDependencia()
    {
        this._has_codDependencia= false;
    } //-- void deleteCodDependencia() 

    /**
     * Method deleteCodEmpresa
     * 
     */
    public void deleteCodEmpresa()
    {
        this._has_codEmpresa= false;
    } //-- void deleteCodEmpresa() 

    /**
     * Method deleteNumSeqDependencia
     * 
     */
    public void deleteNumSeqDependencia()
    {
        this._has_numSeqDependencia= false;
    } //-- void deleteNumSeqDependencia() 

    /**
     * Returns the value of field 'codDependencia'.
     * 
     * @return int
     * @return the value of field 'codDependencia'.
     */
    public int getCodDependencia()
    {
        return this._codDependencia;
    } //-- int getCodDependencia() 

    /**
     * Returns the value of field 'codEmpresa'.
     * 
     * @return long
     * @return the value of field 'codEmpresa'.
     */
    public long getCodEmpresa()
    {
        return this._codEmpresa;
    } //-- long getCodEmpresa() 

    /**
     * Returns the value of field 'codMensagem'.
     * 
     * @return String
     * @return the value of field 'codMensagem'.
     */
    public java.lang.String getCodMensagem()
    {
        return this._codMensagem;
    } //-- java.lang.String getCodMensagem() 

    /**
     * Returns the value of field 'desDependencia'.
     * 
     * @return String
     * @return the value of field 'desDependencia'.
     */
    public java.lang.String getDesDependencia()
    {
        return this._desDependencia;
    } //-- java.lang.String getDesDependencia() 

    /**
     * Returns the value of field 'mensagem'.
     * 
     * @return String
     * @return the value of field 'mensagem'.
     */
    public java.lang.String getMensagem()
    {
        return this._mensagem;
    } //-- java.lang.String getMensagem() 

    /**
     * Returns the value of field 'numSeqDependencia'.
     * 
     * @return int
     * @return the value of field 'numSeqDependencia'.
     */
    public int getNumSeqDependencia()
    {
        return this._numSeqDependencia;
    } //-- int getNumSeqDependencia() 

    /**
     * Method hasCodDependencia
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodDependencia()
    {
        return this._has_codDependencia;
    } //-- boolean hasCodDependencia() 

    /**
     * Method hasCodEmpresa
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodEmpresa()
    {
        return this._has_codEmpresa;
    } //-- boolean hasCodEmpresa() 

    /**
     * Method hasNumSeqDependencia
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasNumSeqDependencia()
    {
        return this._has_numSeqDependencia;
    } //-- boolean hasNumSeqDependencia() 

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
    public void setCodDependencia(int codDependencia)
    {
        this._codDependencia = codDependencia;
        this._has_codDependencia = true;
    } //-- void setCodDependencia(int) 

    /**
     * Sets the value of field 'codEmpresa'.
     * 
     * @param codEmpresa the value of field 'codEmpresa'.
     */
    public void setCodEmpresa(long codEmpresa)
    {
        this._codEmpresa = codEmpresa;
        this._has_codEmpresa = true;
    } //-- void setCodEmpresa(long) 

    /**
     * Sets the value of field 'codMensagem'.
     * 
     * @param codMensagem the value of field 'codMensagem'.
     */
    public void setCodMensagem(java.lang.String codMensagem)
    {
        this._codMensagem = codMensagem;
    } //-- void setCodMensagem(java.lang.String) 

    /**
     * Sets the value of field 'desDependencia'.
     * 
     * @param desDependencia the value of field 'desDependencia'.
     */
    public void setDesDependencia(java.lang.String desDependencia)
    {
        this._desDependencia = desDependencia;
    } //-- void setDesDependencia(java.lang.String) 

    /**
     * Sets the value of field 'mensagem'.
     * 
     * @param mensagem the value of field 'mensagem'.
     */
    public void setMensagem(java.lang.String mensagem)
    {
        this._mensagem = mensagem;
    } //-- void setMensagem(java.lang.String) 

    /**
     * Sets the value of field 'numSeqDependencia'.
     * 
     * @param numSeqDependencia the value of field
     * 'numSeqDependencia'.
     */
    public void setNumSeqDependencia(int numSeqDependencia)
    {
        this._numSeqDependencia = numSeqDependencia;
        this._has_numSeqDependencia = true;
    } //-- void setNumSeqDependencia(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ObterDescDependenciaResponse
     */
    public static br.com.bradesco.web.giss.service.data.pdc.obterdescdependencia.response.ObterDescDependenciaResponse unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.obterdescdependencia.response.ObterDescDependenciaResponse) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.obterdescdependencia.response.ObterDescDependenciaResponse.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.obterdescdependencia.response.ObterDescDependenciaResponse unmarshal(java.io.Reader) 

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
