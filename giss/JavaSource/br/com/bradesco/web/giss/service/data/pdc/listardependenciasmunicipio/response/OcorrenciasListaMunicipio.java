/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: OcorrenciasListaMunicipio.java,v 1.1 2012/12/10 15:18:50 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.listardependenciasmunicipio.response;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class OcorrenciasListaMunicipio.
 * 
 * @version $Revision: 1.1 $ $Date: 2012/12/10 15:18:50 $
 */
public class OcorrenciasListaMunicipio implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _codPessoaJuridica
     */
    private long _codPessoaJuridica = 0;

    /**
     * keeps track of state for field: _codPessoaJuridica
     */
    private boolean _has_codPessoaJuridica;

    /**
     * Field _numSeqPessoaJuridica
     */
    private int _numSeqPessoaJuridica = 0;

    /**
     * keeps track of state for field: _numSeqPessoaJuridica
     */
    private boolean _has_numSeqPessoaJuridica;

    /**
     * Field _codDependencia
     */
    private int _codDependencia = 0;

    /**
     * keeps track of state for field: _codDependencia
     */
    private boolean _has_codDependencia;

    /**
     * Field _descDependencia
     */
    private java.lang.String _descDependencia;

    /**
     * Field _dataAtualizacao
     */
    private java.lang.String _dataAtualizacao;


      //----------------/
     //- Constructors -/
    //----------------/

    public OcorrenciasListaMunicipio() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listardependenciasmunicipio.response.OcorrenciasListaMunicipio()


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
     * Method deleteCodPessoaJuridica
     * 
     */
    public void deleteCodPessoaJuridica()
    {
        this._has_codPessoaJuridica= false;
    } //-- void deleteCodPessoaJuridica() 

    /**
     * Method deleteNumSeqPessoaJuridica
     * 
     */
    public void deleteNumSeqPessoaJuridica()
    {
        this._has_numSeqPessoaJuridica= false;
    } //-- void deleteNumSeqPessoaJuridica() 

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
     * Returns the value of field 'codPessoaJuridica'.
     * 
     * @return long
     * @return the value of field 'codPessoaJuridica'.
     */
    public long getCodPessoaJuridica()
    {
        return this._codPessoaJuridica;
    } //-- long getCodPessoaJuridica() 

    /**
     * Returns the value of field 'dataAtualizacao'.
     * 
     * @return String
     * @return the value of field 'dataAtualizacao'.
     */
    public java.lang.String getDataAtualizacao()
    {
        return this._dataAtualizacao;
    } //-- java.lang.String getDataAtualizacao() 

    /**
     * Returns the value of field 'descDependencia'.
     * 
     * @return String
     * @return the value of field 'descDependencia'.
     */
    public java.lang.String getDescDependencia()
    {
        return this._descDependencia;
    } //-- java.lang.String getDescDependencia() 

    /**
     * Returns the value of field 'numSeqPessoaJuridica'.
     * 
     * @return int
     * @return the value of field 'numSeqPessoaJuridica'.
     */
    public int getNumSeqPessoaJuridica()
    {
        return this._numSeqPessoaJuridica;
    } //-- int getNumSeqPessoaJuridica() 

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
     * Method hasCodPessoaJuridica
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodPessoaJuridica()
    {
        return this._has_codPessoaJuridica;
    } //-- boolean hasCodPessoaJuridica() 

    /**
     * Method hasNumSeqPessoaJuridica
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasNumSeqPessoaJuridica()
    {
        return this._has_numSeqPessoaJuridica;
    } //-- boolean hasNumSeqPessoaJuridica() 

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
     * Sets the value of field 'codPessoaJuridica'.
     * 
     * @param codPessoaJuridica the value of field
     * 'codPessoaJuridica'.
     */
    public void setCodPessoaJuridica(long codPessoaJuridica)
    {
        this._codPessoaJuridica = codPessoaJuridica;
        this._has_codPessoaJuridica = true;
    } //-- void setCodPessoaJuridica(long) 

    /**
     * Sets the value of field 'dataAtualizacao'.
     * 
     * @param dataAtualizacao the value of field 'dataAtualizacao'.
     */
    public void setDataAtualizacao(java.lang.String dataAtualizacao)
    {
        this._dataAtualizacao = dataAtualizacao;
    } //-- void setDataAtualizacao(java.lang.String) 

    /**
     * Sets the value of field 'descDependencia'.
     * 
     * @param descDependencia the value of field 'descDependencia'.
     */
    public void setDescDependencia(java.lang.String descDependencia)
    {
        this._descDependencia = descDependencia;
    } //-- void setDescDependencia(java.lang.String) 

    /**
     * Sets the value of field 'numSeqPessoaJuridica'.
     * 
     * @param numSeqPessoaJuridica the value of field
     * 'numSeqPessoaJuridica'.
     */
    public void setNumSeqPessoaJuridica(int numSeqPessoaJuridica)
    {
        this._numSeqPessoaJuridica = numSeqPessoaJuridica;
        this._has_numSeqPessoaJuridica = true;
    } //-- void setNumSeqPessoaJuridica(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return OcorrenciasListaMunicipio
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listardependenciasmunicipio.response.OcorrenciasListaMunicipio unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listardependenciasmunicipio.response.OcorrenciasListaMunicipio) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listardependenciasmunicipio.response.OcorrenciasListaMunicipio.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listardependenciasmunicipio.response.OcorrenciasListaMunicipio unmarshal(java.io.Reader) 

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
