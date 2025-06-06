/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: Ocorrencias.java,v 1.1 2017/04/11 14:07:03 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.listarreprocessamentodependencia.response;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;
import org.xml.sax.ContentHandler;

/**
 * Class Ocorrencias.
 * 
 * @version $Revision: 1.1 $ $Date: 2017/04/11 14:07:03 $
 */
public class Ocorrencias implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _codigoPessoaJuridica
     */
    private long _codigoPessoaJuridica = 0;

    /**
     * keeps track of state for field: _codigoPessoaJuridica
     */
    private boolean _has_codigoPessoaJuridica;

    /**
     * Field _numeroSequenciaUnidadeOrganizacional
     */
    private int _numeroSequenciaUnidadeOrganizacional = 0;

    /**
     * keeps track of state for field:
     * _numeroSequenciaUnidadeOrganizacional
     */
    private boolean _has_numeroSequenciaUnidadeOrganizacional;

    /**
     * Field _codigoDependencia
     */
    private java.lang.String _codigoDependencia;

    /**
     * Field _descricaoDependencia
     */
    private java.lang.String _descricaoDependencia;


      //----------------/
     //- Constructors -/
    //----------------/

    public Ocorrencias() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarreprocessamentodependencia.response.Ocorrencias()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodigoPessoaJuridica
     * 
     */
    public void deleteCodigoPessoaJuridica()
    {
        this._has_codigoPessoaJuridica= false;
    } //-- void deleteCodigoPessoaJuridica() 

    /**
     * Method deleteNumeroSequenciaUnidadeOrganizacional
     * 
     */
    public void deleteNumeroSequenciaUnidadeOrganizacional()
    {
        this._has_numeroSequenciaUnidadeOrganizacional= false;
    } //-- void deleteNumeroSequenciaUnidadeOrganizacional() 

    /**
     * Returns the value of field 'codigoDependencia'.
     * 
     * @return String
     * @return the value of field 'codigoDependencia'.
     */
    public java.lang.String getCodigoDependencia()
    {
        return this._codigoDependencia;
    } //-- java.lang.String getCodigoDependencia() 

    /**
     * Returns the value of field 'codigoPessoaJuridica'.
     * 
     * @return long
     * @return the value of field 'codigoPessoaJuridica'.
     */
    public long getCodigoPessoaJuridica()
    {
        return this._codigoPessoaJuridica;
    } //-- long getCodigoPessoaJuridica() 

    /**
     * Returns the value of field 'descricaoDependencia'.
     * 
     * @return String
     * @return the value of field 'descricaoDependencia'.
     */
    public java.lang.String getDescricaoDependencia()
    {
        return this._descricaoDependencia;
    } //-- java.lang.String getDescricaoDependencia() 

    /**
     * Returns the value of field
     * 'numeroSequenciaUnidadeOrganizacional'.
     * 
     * @return int
     * @return the value of field
     * 'numeroSequenciaUnidadeOrganizacional'.
     */
    public int getNumeroSequenciaUnidadeOrganizacional()
    {
        return this._numeroSequenciaUnidadeOrganizacional;
    } //-- int getNumeroSequenciaUnidadeOrganizacional() 

    /**
     * Method hasCodigoPessoaJuridica
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoPessoaJuridica()
    {
        return this._has_codigoPessoaJuridica;
    } //-- boolean hasCodigoPessoaJuridica() 

    /**
     * Method hasNumeroSequenciaUnidadeOrganizacional
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasNumeroSequenciaUnidadeOrganizacional()
    {
        return this._has_numeroSequenciaUnidadeOrganizacional;
    } //-- boolean hasNumeroSequenciaUnidadeOrganizacional() 

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
     * Sets the value of field 'codigoDependencia'.
     * 
     * @param codigoDependencia the value of field
     * 'codigoDependencia'.
     */
    public void setCodigoDependencia(java.lang.String codigoDependencia)
    {
        this._codigoDependencia = codigoDependencia;
    } //-- void setCodigoDependencia(java.lang.String) 

    /**
     * Sets the value of field 'codigoPessoaJuridica'.
     * 
     * @param codigoPessoaJuridica the value of field
     * 'codigoPessoaJuridica'.
     */
    public void setCodigoPessoaJuridica(long codigoPessoaJuridica)
    {
        this._codigoPessoaJuridica = codigoPessoaJuridica;
        this._has_codigoPessoaJuridica = true;
    } //-- void setCodigoPessoaJuridica(long) 

    /**
     * Sets the value of field 'descricaoDependencia'.
     * 
     * @param descricaoDependencia the value of field
     * 'descricaoDependencia'.
     */
    public void setDescricaoDependencia(java.lang.String descricaoDependencia)
    {
        this._descricaoDependencia = descricaoDependencia;
    } //-- void setDescricaoDependencia(java.lang.String) 

    /**
     * Sets the value of field
     * 'numeroSequenciaUnidadeOrganizacional'.
     * 
     * @param numeroSequenciaUnidadeOrganizacional the value of
     * field 'numeroSequenciaUnidadeOrganizacional'.
     */
    public void setNumeroSequenciaUnidadeOrganizacional(int numeroSequenciaUnidadeOrganizacional)
    {
        this._numeroSequenciaUnidadeOrganizacional = numeroSequenciaUnidadeOrganizacional;
        this._has_numeroSequenciaUnidadeOrganizacional = true;
    } //-- void setNumeroSequenciaUnidadeOrganizacional(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return Ocorrencias
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarreprocessamentodependencia.response.Ocorrencias unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarreprocessamentodependencia.response.Ocorrencias) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarreprocessamentodependencia.response.Ocorrencias.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarreprocessamentodependencia.response.Ocorrencias unmarshal(java.io.Reader) 

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
