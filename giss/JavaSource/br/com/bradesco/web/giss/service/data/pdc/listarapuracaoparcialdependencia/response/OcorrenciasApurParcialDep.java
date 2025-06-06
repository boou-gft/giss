/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: OcorrenciasApurParcialDep.java,v 1.1 2017/04/11 14:12:17 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.listarapuracaoparcialdependencia.response;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class OcorrenciasApurParcialDep.
 * 
 * @version $Revision: 1.1 $ $Date: 2017/04/11 14:12:17 $
 */
public class OcorrenciasApurParcialDep implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _codPessoaJurid
     */
    private long _codPessoaJurid = 0;

    /**
     * keeps track of state for field: _codPessoaJurid
     */
    private boolean _has_codPessoaJurid;

    /**
     * Field _numSeqUnidOrganizacional
     */
    private int _numSeqUnidOrganizacional = 0;

    /**
     * keeps track of state for field: _numSeqUnidOrganizacional
     */
    private boolean _has_numSeqUnidOrganizacional;

    /**
     * Field _codDependenciaOcor
     */
    private int _codDependenciaOcor = 0;

    /**
     * keeps track of state for field: _codDependenciaOcor
     */
    private boolean _has_codDependenciaOcor;

    /**
     * Field _descDependenciaOcor
     */
    private java.lang.String _descDependenciaOcor;

    /**
     * Field _sinalReceita
     */
    private java.lang.String _sinalReceita;

    /**
     * Field _valorReceita
     */
    private java.math.BigDecimal _valorReceita = new java.math.BigDecimal("0");

    /**
     * Field _sinalISS
     */
    private java.lang.String _sinalISS;

    /**
     * Field _valorISS
     */
    private java.math.BigDecimal _valorISS = new java.math.BigDecimal("0");


      //----------------/
     //- Constructors -/
    //----------------/

    public OcorrenciasApurParcialDep() 
     {
        super();
        setValorReceita(new java.math.BigDecimal("0"));
        setValorISS(new java.math.BigDecimal("0"));
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarapuracaoparcialdependencia.response.OcorrenciasApurParcialDep()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodDependenciaOcor
     * 
     */
    public void deleteCodDependenciaOcor()
    {
        this._has_codDependenciaOcor= false;
    } //-- void deleteCodDependenciaOcor() 

    /**
     * Method deleteCodPessoaJurid
     * 
     */
    public void deleteCodPessoaJurid()
    {
        this._has_codPessoaJurid= false;
    } //-- void deleteCodPessoaJurid() 

    /**
     * Method deleteNumSeqUnidOrganizacional
     * 
     */
    public void deleteNumSeqUnidOrganizacional()
    {
        this._has_numSeqUnidOrganizacional= false;
    } //-- void deleteNumSeqUnidOrganizacional() 

    /**
     * Returns the value of field 'codDependenciaOcor'.
     * 
     * @return int
     * @return the value of field 'codDependenciaOcor'.
     */
    public int getCodDependenciaOcor()
    {
        return this._codDependenciaOcor;
    } //-- int getCodDependenciaOcor() 

    /**
     * Returns the value of field 'codPessoaJurid'.
     * 
     * @return long
     * @return the value of field 'codPessoaJurid'.
     */
    public long getCodPessoaJurid()
    {
        return this._codPessoaJurid;
    } //-- long getCodPessoaJurid() 

    /**
     * Returns the value of field 'descDependenciaOcor'.
     * 
     * @return String
     * @return the value of field 'descDependenciaOcor'.
     */
    public java.lang.String getDescDependenciaOcor()
    {
        return this._descDependenciaOcor;
    } //-- java.lang.String getDescDependenciaOcor() 

    /**
     * Returns the value of field 'numSeqUnidOrganizacional'.
     * 
     * @return int
     * @return the value of field 'numSeqUnidOrganizacional'.
     */
    public int getNumSeqUnidOrganizacional()
    {
        return this._numSeqUnidOrganizacional;
    } //-- int getNumSeqUnidOrganizacional() 

    /**
     * Returns the value of field 'sinalISS'.
     * 
     * @return String
     * @return the value of field 'sinalISS'.
     */
    public java.lang.String getSinalISS()
    {
        return this._sinalISS;
    } //-- java.lang.String getSinalISS() 

    /**
     * Returns the value of field 'sinalReceita'.
     * 
     * @return String
     * @return the value of field 'sinalReceita'.
     */
    public java.lang.String getSinalReceita()
    {
        return this._sinalReceita;
    } //-- java.lang.String getSinalReceita() 

    /**
     * Returns the value of field 'valorISS'.
     * 
     * @return BigDecimal
     * @return the value of field 'valorISS'.
     */
    public java.math.BigDecimal getValorISS()
    {
        return this._valorISS;
    } //-- java.math.BigDecimal getValorISS() 

    /**
     * Returns the value of field 'valorReceita'.
     * 
     * @return BigDecimal
     * @return the value of field 'valorReceita'.
     */
    public java.math.BigDecimal getValorReceita()
    {
        return this._valorReceita;
    } //-- java.math.BigDecimal getValorReceita() 

    /**
     * Method hasCodDependenciaOcor
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodDependenciaOcor()
    {
        return this._has_codDependenciaOcor;
    } //-- boolean hasCodDependenciaOcor() 

    /**
     * Method hasCodPessoaJurid
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodPessoaJurid()
    {
        return this._has_codPessoaJurid;
    } //-- boolean hasCodPessoaJurid() 

    /**
     * Method hasNumSeqUnidOrganizacional
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasNumSeqUnidOrganizacional()
    {
        return this._has_numSeqUnidOrganizacional;
    } //-- boolean hasNumSeqUnidOrganizacional() 

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
     * Sets the value of field 'codDependenciaOcor'.
     * 
     * @param codDependenciaOcor the value of field
     * 'codDependenciaOcor'.
     */
    public void setCodDependenciaOcor(int codDependenciaOcor)
    {
        this._codDependenciaOcor = codDependenciaOcor;
        this._has_codDependenciaOcor = true;
    } //-- void setCodDependenciaOcor(int) 

    /**
     * Sets the value of field 'codPessoaJurid'.
     * 
     * @param codPessoaJurid the value of field 'codPessoaJurid'.
     */
    public void setCodPessoaJurid(long codPessoaJurid)
    {
        this._codPessoaJurid = codPessoaJurid;
        this._has_codPessoaJurid = true;
    } //-- void setCodPessoaJurid(long) 

    /**
     * Sets the value of field 'descDependenciaOcor'.
     * 
     * @param descDependenciaOcor the value of field
     * 'descDependenciaOcor'.
     */
    public void setDescDependenciaOcor(java.lang.String descDependenciaOcor)
    {
        this._descDependenciaOcor = descDependenciaOcor;
    } //-- void setDescDependenciaOcor(java.lang.String) 

    /**
     * Sets the value of field 'numSeqUnidOrganizacional'.
     * 
     * @param numSeqUnidOrganizacional the value of field
     * 'numSeqUnidOrganizacional'.
     */
    public void setNumSeqUnidOrganizacional(int numSeqUnidOrganizacional)
    {
        this._numSeqUnidOrganizacional = numSeqUnidOrganizacional;
        this._has_numSeqUnidOrganizacional = true;
    } //-- void setNumSeqUnidOrganizacional(int) 

    /**
     * Sets the value of field 'sinalISS'.
     * 
     * @param sinalISS the value of field 'sinalISS'.
     */
    public void setSinalISS(java.lang.String sinalISS)
    {
        this._sinalISS = sinalISS;
    } //-- void setSinalISS(java.lang.String) 

    /**
     * Sets the value of field 'sinalReceita'.
     * 
     * @param sinalReceita the value of field 'sinalReceita'.
     */
    public void setSinalReceita(java.lang.String sinalReceita)
    {
        this._sinalReceita = sinalReceita;
    } //-- void setSinalReceita(java.lang.String) 

    /**
     * Sets the value of field 'valorISS'.
     * 
     * @param valorISS the value of field 'valorISS'.
     */
    public void setValorISS(java.math.BigDecimal valorISS)
    {
        this._valorISS = valorISS;
    } //-- void setValorISS(java.math.BigDecimal) 

    /**
     * Sets the value of field 'valorReceita'.
     * 
     * @param valorReceita the value of field 'valorReceita'.
     */
    public void setValorReceita(java.math.BigDecimal valorReceita)
    {
        this._valorReceita = valorReceita;
    } //-- void setValorReceita(java.math.BigDecimal) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return OcorrenciasApurParcialDep
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarapuracaoparcialdependencia.response.OcorrenciasApurParcialDep unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarapuracaoparcialdependencia.response.OcorrenciasApurParcialDep) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarapuracaoparcialdependencia.response.OcorrenciasApurParcialDep.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarapuracaoparcialdependencia.response.OcorrenciasApurParcialDep unmarshal(java.io.Reader) 

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
